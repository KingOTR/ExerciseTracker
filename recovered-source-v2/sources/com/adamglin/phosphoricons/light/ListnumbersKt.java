package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Listnumbers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ListNumbers", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getListNumbers", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_listNumbers", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListnumbersKt {
    private static ImageVector _listNumbers;

    public static final ImageVector getListNumbers(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _listNumbers;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ListNumbers", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 70.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 186.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(42.68f, 53.37f);
        pathBuilder.lineTo(50.0f, 49.71f);
        pathBuilder.verticalLineTo(104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.68f, -5.37f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 10.74f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 202.0f);
        pathBuilder.horizontalLineTo(52.0f);
        pathBuilder.lineToRelative(21.48f, -28.74f);
        pathBuilder.arcTo(21.5f, 21.5f, 0.0f, false, false, 77.79f, 157.0f);
        pathBuilder.arcTo(21.75f, 21.75f, 0.0f, false, false, 69.0f, 142.38f);
        pathBuilder.arcToRelative(22.86f, 22.86f, 0.0f, false, false, -31.35f, 4.31f);
        pathBuilder.arcToRelative(22.18f, 22.18f, 0.0f, false, false, -3.28f, 5.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.28f, 4.11f);
        pathBuilder.arcToRelative(9.87f, 9.87f, 0.0f, false, true, 1.48f, -2.67f);
        pathBuilder.arcToRelative(10.78f, 10.78f, 0.0f, false, true, 14.78f, -2.0f);
        pathBuilder.arcToRelative(9.89f, 9.89f, 0.0f, false, true, 4.0f, 6.61f);
        pathBuilder.arcToRelative(9.64f, 9.64f, 0.0f, false, true, -2.0f, 7.28f);
        pathBuilder.lineToRelative(-0.06f, 0.09f);
        pathBuilder.lineTo(35.2f, 204.41f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 214.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _listNumbers = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
