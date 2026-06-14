package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Babycarriage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BabyCarriage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBabyCarriage", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_babyCarriage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BabycarriageKt {
    private static ImageVector _babyCarriage;

    public static final ImageVector getBabyCarriage(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _babyCarriage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BabyCarriage", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.lineTo(51.77f, 108.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 16.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.87f, 108.0f);
        pathBuilder.lineTo(155.4f, 108.0f);
        pathBuilder.lineToRelative(53.71f, -43.0f);
        pathBuilder.arcTo(67.76f, 67.76f, 0.0f, false, true, 227.87f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(67.72f, 67.72f, 0.0f, false, true, 43.2f, 15.52f);
        pathBuilder.lineTo(148.0f, 103.68f);
        pathBuilder.lineTo(148.0f, 48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 152.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 180.0f);
        pathBuilder.lineTo(120.0f, 180.0f);
        pathBuilder.arcToRelative(68.08f, 68.08f, 0.0f, false, true, -67.88f, -64.0f);
        pathBuilder.lineTo(227.88f, 116.0f);
        pathBuilder.arcTo(68.08f, 68.08f, 0.0f, false, true, 160.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _babyCarriage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
