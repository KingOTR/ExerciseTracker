package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lectern.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lectern", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLectern", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lectern", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LecternKt {
    private static ImageVector _lectern;

    public static final ImageVector getLectern(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _lectern;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lectern", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.87f, 119.06f);
        pathBuilder.lineToRelative(-40.0f, -80.0f);
        pathBuilder.arcTo(19.89f, 19.89f, 0.0f, false, false, 192.0f, 28.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(19.89f, 19.89f, 0.0f, false, false, 46.13f, 39.06f);
        pathBuilder.lineToRelative(-40.0f, 80.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 24.0f, 148.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(148.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.89f, -28.94f);
        pathBuilder.close();
        pathBuilder.moveTo(30.49f, 124.0f);
        pathBuilder.lineToRelative(36.0f, -72.0f);
        pathBuilder.horizontalLineToRelative(123.0f);
        pathBuilder.lineToRelative(36.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(180.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lectern = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
